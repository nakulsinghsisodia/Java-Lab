public class DuplicateFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 8, 3, 6, 8, 8};
        int n = arr.length;
        boolean[] visited = new boolean[n];

        System.out.println("Duplicate elements and their frequencies:");

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

            if(count > 1) {
                System.out.println(arr[i] + " -> " + count + " times");
            }
        }
    }
}

output: Duplicate elements and their frequencies:
2 -> 2 times
3 -> 2 times
8 -> 3 times
