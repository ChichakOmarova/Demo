public class Array4 {

    public static void main(String[] args) {
        String[] employeeNames = {"Əli", "Ayşə", "Kamran", "Leyla"};
        String targetName = "Kamran";
        int result = searchEmployeeName(employeeNames, targetName);

        if (result != -1) {
            System.out.println("'" + targetName + "' adının indeksi: " + result);
        } else {
            System.out.println("'" + targetName + "' adı siyahıda tapılmadı.");
        }
    }

    public static int searchEmployeeName(String[] employeeNames, String targetName) {
        for (int i = 0; i < employeeNames.length; i++) {
            if (employeeNames[i].equals(targetName)) {
                return i;
            }
        }
        return -1;
    }
}