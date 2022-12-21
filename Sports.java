package Sports;

import java.util.*;
import static java.lang.Math.max;
public class Sports {
    public static List consecutive(int n,char c,ArrayList<Team> results){
        ArrayList<Team> res = new ArrayList<Team>();
        int count =0;
        int consecutiveCount = 0;
        for (int i=0;i<results.size();i++){
            String m=results.get(i).gettMatches();
            for(int j =0;j<m.length();j++) {
                if(m.charAt(j)==c){
                    count += 1;
                    consecutiveCount = max(consecutiveCount,count);
                }else{
                    count=0;
                }
            }
            if(consecutiveCount==n){
                res.add(results.get(i));
            }
            else{
                res.equals(0);
            }

            consecutiveCount=0;
        }
        return res;
    }
    public static void main(String[] args) {

        ArrayList<Team> teams = new ArrayList<>();
        teams.add(new Team("GT", 20, "WWLLW"));
        teams.add(new Team("LSG", 18, "WLLWW"));
        teams.add(new Team("RR", 16, "WLWLL"));
        teams.add(new Team("DC", 14, "WWLWL"));
        teams.add(new Team("RCB", 14, "LWWLL"));
        teams.add(new Team("KKR", 12, "LWWLW"));
        teams.add(new Team("PBKS", 12, "LWLWL"));
        teams.add(new Team("SRH", 12, "WLLLL"));
        teams.add(new Team("CSK", 8, "LWWWW"));
        teams.add(new Team("MI", 8, "LWLWW"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of consecutive values:");
        int n = sc.nextInt();
        System.out.println("Enter Loss/Win:");
        char c = sc.next().charAt(0);
        List<Team> res = consecutive(n,c,teams);
        for(Team t : res){
            System.out.println(t.gettName());
        }
        System.out.println("----------------------------------");
        System.out.println("Two consecutives loss:");
        List<Team> twoCon = consecutive(2,'L',teams);
        for(Team t : twoCon){
            System.out.println(t.gettName());
        }
        System.out.println("----------------------------------");
        System.out.println("Average points of the filtered items");
        int sum =0;
        long avg = 0;
        for(Team t:res){
            long num = res.size();
            sum+=t.gettPoints();
            avg=sum/num;
        }
        System.out.println(avg);
    }
}
