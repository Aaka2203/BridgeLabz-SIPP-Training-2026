class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Member Name : " + memberName);
        System.out.println("Member ID   : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 2.0;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 1.0;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5.0;
    }
}

public class SmartLibraryMembershipSystem {

    // Search member by ID
    static void searchMember(LibraryMember[] members, String searchId) {

        for (LibraryMember member : members) {

            if (member.memberId.equals(searchId)) {

                System.out.println("\nMember Found");
                member.printDetails();
                return;
            }
        }

        System.out.println("\nMember with ID " + searchId + " not found.");
    }

    public static void main(String[] args) {

        LibraryMember[] members = {

                new StudentMember("Mukund", "S101"),
                new FacultyMember("Rahul", "F201"),
                new GuestMember("Aman", "G301")
        };

        int overdueDays = 5;

        System.out.println("----- Library Members -----\n");

        for (LibraryMember member : members) {

            member.printDetails();

            System.out.println("Fine for " + overdueDays +
                    " overdue days = ₹" +
                    member.calculateFine(overdueDays));

            System.out.println();
        }

        // Search by ID
        searchMember(members, "F201");
    }
}
