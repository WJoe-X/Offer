import java.util.*;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:40 2018/8/9
 */
public class Wangyi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int Q = scanner.nextInt();
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] randScore = new int[Q];
            for (int j = 0; j < N; j++) {
                int start = scanner.nextInt();
                int end = scanner.nextInt();
                int randRScore = scanner.nextInt();
                for (int k = start; k <= end; k++) {
                    randScore[k-1] = randRScore;
                }
            }
            int[] killScore = new int[M + 1];
            for (int j = 0; j < M + 1; j++) {
                killScore[j] = scanner.nextInt();
            }
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            List<KillInfo> killInfos = new ArrayList<>();
            Map<String, Integer> scoreInfos = new TreeMap<>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            for (int j = 0; j < Q-1; j++) {
                KillInfo killInfo = new KillInfo();
                killInfo.timeK = Integer.valueOf(scanner.next());
                killInfo.Killer = scanner.next();
                killInfo.Victim = scanner.next();
                killInfos.add(killInfo);
                scoreInfos.put(killInfo.Victim, 0);
                if (j==Q-2)
                    scoreInfos.put(killInfo.Killer,0);
            }
            for (int j = 0; j < killInfos.size(); j++) {
                int score = getRankScore(randScore, killInfos.size()-j) + getLiveScore(A, B, killInfos.get(j).timeK);
                int kills = getKillScore(killScore, scoreInfos.get(killInfos.get(j).Victim));
                scoreInfos.put(killInfos.get(j).Victim, score + kills);
                if (j==killInfos.size()-1){
                     score = getRankScore(randScore, killInfos.size()-j) + getLiveScore(A, B, killInfos.get(j).timeK);
                     kills = getKillScore(killScore, scoreInfos.get(killInfos.get(j).Victim));
                    scoreInfos.put(killInfos.get(j).Killer, score + kills);
                }

            }

            for ( Map.Entry entry: scoreInfos.entrySet()) {
                System.out.println(entry.getKey() +" "+entry.getValue());
            }
        }
    }


    private static Integer getLiveScore(int A, int B, int liveTime) {
        return A * liveTime + B;
    }
    private static Integer getRankScore(int[] rankSocre, int rank) {
        if (rank == rankSocre.length)
            return rankSocre[rankSocre.length - 2];
        return rankSocre[rank - 1];
    }
    private static Integer getKillScore(int[] killSocres, int n) {
        if (n > killSocres.length - 1)
            return killSocres[killSocres.length - 1];
        return killSocres[n];
    }
}
class KillInfo {
    int timeK;
    String Killer;
    String Victim;
}



