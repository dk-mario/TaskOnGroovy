class Main {
    static void main(String[] args) {
        int[] array = [1, 3, 4, 5, 1, 5, 4];
        Map<Integer, Integer> digits = new HashMap<>();
        for (Integer x : array) {
            if (!digits.containsKey(x)) {
                digits.put(x, 1);
            } else {
                digits.put(x, digits.get(x) + 1);
            }
        }
        println(digits);
    }
}