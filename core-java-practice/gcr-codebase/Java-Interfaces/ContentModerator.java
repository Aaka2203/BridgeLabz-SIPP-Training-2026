interface TextModeration {

    void checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive language is prohibited.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("hate")
                || post.toLowerCase().contains("abuse");
    }
}

interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Spam messages are prohibited.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public void checkOffensiveContent(String post) {
        if (TextModeration.containsRestrictedWords(post))
            System.out.println("Offensive Post: " + post);
    }

    @Override
    public void checkSpam(String post) {
        if (post.toLowerCase().contains("buy now") ||
                post.toLowerCase().contains("click here"))
            System.out.println("Spam Post: " + post);
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static void main(String[] args) {

        String[] posts = {
                "I love Java programming.",
                "Buy Now and Get 50% OFF!",
                "I hate this service.",
                "Click Here to win prizes!",
                "Have a nice day."
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            boolean spam = post.toLowerCase().contains("buy now")
                    || post.toLowerCase().contains("click here");

            boolean offensive = TextModeration.containsRestrictedWords(post);

            if (spam) {
                moderator.checkSpam(post);
            } else if (offensive) {
                moderator.checkOffensiveContent(post);
            } else {
                System.out.println("Valid Post: " + post);
            }
        }
    }
}
