import java.util.*;
class ActivitySelection{
    static int activitySelection(int start[],int end[]){
        int count=0;
        int time=0;
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<activities.length;i++){
            if(time<=activities[i][1]){
                time=activities[i][2];
                count++;
                list.add(activities[i][0]);
            }
        }
        System.out.print("Activities are: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        System.out.println("Max Activites: "+activitySelection(start, end));
    }
}