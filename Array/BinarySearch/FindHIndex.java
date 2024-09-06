package Array.BinarySearch;

public class FindHIndex {
    public int hIndex(int[] citations) {
        int start = 0;
        int end = citations.length - 1;
        int len = citations.length;
        int hIndex = 0;  // Default value for hIndex should be 0

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (citations[mid] == (len - mid)) {
                return citations[mid];
            } else if (citations[mid] < (len - mid)) {
                start = mid + 1;
            } else {
                hIndex = len - mid;
                end = mid - 1;
            }
        }

        return hIndex;
    }

    public static void main(String[] args) {
        FindHIndex obj = new FindHIndex();
        int[] citations = {100};

        int index = obj.hIndex(citations);
        System.out.println(index);
    }
}
