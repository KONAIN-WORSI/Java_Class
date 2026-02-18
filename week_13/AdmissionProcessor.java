package week_13;

/**
 * Write a description of class AdmissionProcessor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdmissionProcessor
{
    public static String formatName(String rawName) {
        String trimmed = rawName.trim();
        String[] words = trimmed.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if(i > 0) sb.append(" ");
            String first = words[i].substring(0,1).toUpperCase();
            String rest = words[i].substring(1).toLowerCase();
            sb.append(first).append(rest);
        }
        return sb.toString();
    }
    
    public static boolean isValidEmail(String email) {
        if (email == null) return false;
        email = email.trim();
        if (email.length() == 0) return false;
        
        int atIndex = email.indexOf("@");
        int lastAt = email.lastIndexOf("@");
        
        if (atIndex <= 0 || atIndex != lastAt) return false;
        
        int lastDot = email.lastIndexOf(".");
        
        if (lastDot <= atIndex + 1) return false;
        if (lastDot == email.length() - 1) return false;
        
        return true;
    }
    
    public static String generateReport(String name, String email) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Admission Report ===\n");
        
        sb.append("Name:    ").append(formatName(name)).append("\n");
        sb.append("Email:   ").append(email.trim()).append("\n");
        
        String domain = email.substring(email.indexOf("@") + 1);
        String type = domain.equalsIgnoreCase("iic.edu.np") ? "Internal" : "External";
        
        sb.append("Domain:   ").append(domain).append(" (").append(" )\n");
        
        String status = isValidEmail(email) ? "VALID" : "INVALID";
        sb.append("Status:  ").append(status).append("\n");
        return sb.toString();
    }
    
    public static String checkPasswordStrength(String password) {
        if (password == null || password.trim().isEmpty()) {
            return "Please fill the password";
        }
        
        password = password.trim();
        
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacters = false;
        
        String specialCharacter = "!@#$%^&*";
        
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            
            if(Character.isUpperCase(ch)) {
                hasUpper = true;
            }
            else if (Character.isLowerCase(ch)) {
                hasLower = true;
            }
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            else if (specialCharacter.contains(String.valueOf(ch))) {
                hasSpecialCharacters = true;
            }            
        }
        
        if (password.length() <= 8 && hasUpper) {
                return "Weak Password";
            }
            
        if(password.length() <= 8 && hasUpper && hasLower && hasDigit && hasSpecialCharacters) {
            return "Strong Password";
        }
        
        return "Medium Password: (Use uppercase, lowercase, number & special characters)";
    }
    
    public static String processAdmission(String name, String email, String password) {
        StringBuilder sb = new StringBuilder();
        sb.append("==== Admission Report ===\n");
        sb.append("Name:   ").append(formatName(name)).append("\n");
        sb.append("Email:   ").append(isValidEmail(email)).append("\n");
        sb.append("Password:  ").append(checkPasswordStrength(password)).append("\n");
        
        boolean validEmail = (isValidEmail(email)) ? true : false;
        boolean validPassword = (checkPasswordStrength(password).toLowerCase().equals("medium") || checkPasswordStrength(password).toLowerCase().equals("storng")) ? true : false;
        String decision = (validEmail || validPassword) ? "APPROVED" : "REJECTED";
        sb.append("Decision:   ").append(decision);
        
        return sb.toString();
    }
    
    public static void main(String args[]) {
        AdmissionProcessor a =  new AdmissionProcessor();
        
        System.out.println(a.processAdmission("konain", "konaina@gmail.com", "hrkhvbuknkk"));
    }
}