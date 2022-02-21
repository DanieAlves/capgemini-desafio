public class Question2 {

    public static void main(String[] args) {
        int minPassLength = 6;
        String password = "Ya3";

        boolean passValid = validPasswordConditions(password);

        if (password.length() < minPassLength) {
            System.out.print("Para ser uma senha forte precisa de mais " + (minPassLength - password.length()) + " caracter ");
        } else {
            if (passValid) {
                System.out.print("Parabéns, sua senha é forte");
            }else {
                System.out.print("Sua senha não atende todos os criterios para ser uma senha forte");
            }
        }
    }

    //validar criterios da senha
    public static boolean validPasswordConditions(String str){
        //criterios da senha
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?=\\S+$).{6,}";

        return str.matches(pattern);
    }
}
