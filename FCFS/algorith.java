
class algorithm {

    static void findWaitingTime(int processes[], int n, int bt[], int wt[]) {
        wt[0] = 0;
        for (int i = 1; i < n; i++) {
            wt[i] = bt[i - 1] + wt[i - 1];
        }
    }

    static void findTurnAroundT(int processes[], int n, int bt[], int wt[], int tat[]) {
        for (int i = 0; i < n; i++) {
            tat[i] = bt[i] + wt[i];
        }
    }

    static void findAverageT(int processes[], int n, int bt[]) {
        int wt[] = new int[n];
        int tat[] = new int[n];
        int total_wt = 0, total_tat = 0;
        findWaitingTime(processes, n, bt, wt);
        findTurnAroundT(processes, n, bt, wt, tat);

        for (int i = 0; i < n; i++) {
            total_wt = total_wt + wt[i];
            total_tat += tat[i];
            System.out.println("Process Number: " + (i + 1));
            System.out.println("Burst Time: " + bt[i]);
            System.out.println("Waiting Time: " + wt[i]);
            System.out.println("Turn Around Time: " + tat[i]);
            System.out.println();
        }
        float s = (float) total_wt / (float) n;
        int t = total_tat / n;
        System.out.printf("Average waiting time = %f", s);
        System.out.printf("\n");
        System.out.printf("Average turn around time = %d ", t);
    }

    public static void main(String[] args) {
        int processes[] = { 1, 2, 3 };
        int n = processes.length;

        int burst_time[] = { 10, 5, 8 };

        findAverageT(processes, n, burst_time);
    }

}