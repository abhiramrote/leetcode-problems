class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>result=new ArrayList<>();
        if(digits.isEmpty())return result;
        HashMap<Character,String>hm=new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        StringBuilder currentCombi=new StringBuilder();
        backtrack(digits,0,hm,currentCombi,result);
        return result;
    }
    public void backtrack(String digits,int index,Map<Character, String> mapping, StringBuilder currentCombination, List<String> result){
        if(index==digits.length()){
            result.add(currentCombination.toString());
            return;
        }
          char digit = digits.charAt(index);
        String letters = mapping.get(digit);
        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter);
            backtrack(digits, index + 1, mapping, currentCombination, result);
            currentCombination.deleteCharAt(currentCombination.length() - 1); // Backtrack by removing the last letter added
        }
    }
}
