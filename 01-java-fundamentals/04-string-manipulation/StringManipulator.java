public class StringManipulator {
    
    public void trimAndConcat(String str, String str2){      // using void so due to console print line rather than a return
        String trim1 = str.trim();
        String trim2 = str2.trim();
        String result = trim1.concat(trim2);
        System.out.println(result);
    }

    public Integer getIndexOrNull(String str, char o){       // using Integer due to the return being a number, not a string
        if (str.indexOf(o) == -1){
            return null;
        }
        return str.indexOf(o);
    }

    public Integer getIndexOrNull(String str, String sub){
        if(str.indexOf(sub) == -1) {         //set this equal to -1 because we expect it not to be found, so we return null
    		return null;
    	}
    	return str.indexOf(sub);             //if it is found then we can return the index
    
    }

    public String concatSubString(String str, Integer a, Integer b, String sub){
        String substr;
        try {
            substr = str.substring(a, b);
        } catch (IndexOutOfBoundsException s){
            System.out.println(String.format("Exception caught: %s", s));
            substr="whoops!";
        }

        return substr.concat(sub);
        
    }
}