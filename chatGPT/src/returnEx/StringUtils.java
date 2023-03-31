package returnEx;

public class StringUtils {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
    
    
    
    public static void main(String[] args) {
		
    	String str1 = "";
    	String str2 = null;
    	String str3 = "Hello, World";
    	boolean isStrNullOrEmpty1 = StringUtils.isNullOrEmpty(str1);
    	boolean isStrNullOrEmpty2 = StringUtils.isNullOrEmpty(str2);
    	boolean isStrNullOrEmpty3 = StringUtils.isNullOrEmpty(str3);
    	// isStrNullOrEmpty 변수에 false가 저장됩니다.
    	
    	System.out.println(isStrNullOrEmpty1);
    	System.out.println(isStrNullOrEmpty2);
    	System.out.println(isStrNullOrEmpty3);
	}
    
    
}

