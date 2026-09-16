import java.util.*;
public class JobSequencing {

    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i,int d,int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int JobsInfo[][]=  {{4,20},{1,10},{1,40},{1,30}};
        Job jobs[]=new Job[JobsInfo.length];
        for(int i=0;i<jobs.length;i++){
            jobs[i]=new Job(i, JobsInfo[i][0], JobsInfo[i][1]);
        }
    }
}
