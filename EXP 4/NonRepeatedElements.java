public class NonRepeatedElements {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 4, 5, 8, 9};
        int n = arr.length;
        boolean[] visited = new boolean[n];

        System.out.println("Non-repeated elements are:");

        for(int i = 0; i < n; i++) {
            if(visited[i] == true)
                continue;

            int count = 1;

            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if(count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}

output: Non-repeated elements are:
6
7
8
9
