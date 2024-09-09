public class Sum1dArray {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.sumatoria(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

class Solution {
    public int[] sumatoria(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return new int[0];
        }

        int[] sumatoria = new int[numeros.length];
        sumatoria[0] = numeros[0]; // Inicializa el primer elemento de sumatoria

        for (int i = 1; i < numeros.length; i++) {
            sumatoria[i] = numeros[i] + sumatoria[i - 1];
        }

        return sumatoria;
    }
}
