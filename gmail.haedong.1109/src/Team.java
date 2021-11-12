import java.util.ArrayList;
import java.util.List;

public class Team {
	private String team_name;
	private int count;
	private int win;
	private int tie;
	private int defeat;
	private int points;
	//데이터 목록
	private List<String> players;
	
	//생성자
	//메모리 할당을 해야 하는 속성들의 메모리 할당을 생성자에서 미리 해주면 외부에서 메모리 할당을 하지 않아서 발생하는 NullPointerException을 줄일 수 있
	public Team() {
		//선수 명단을 저장할 List에 메모리 할당 
		players = new ArrayList<>();
	
	}

	/**
	 * @return the team_name
	 */
	public String getTeam_name() {
		return team_name;
	}

	/**
	 * @param team_name the team_name to set
	 */
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the win
	 */
	public int getWin() {
		return win;
	}

	/**
	 * @param win the win to set
	 */
	public void setWin(int win) {
		this.win = win;
	}

	/**
	 * @return the tie
	 */
	public int getTie() {
		return tie;
	}

	/**
	 * @param tie the tie to set
	 */
	public void setTie(int tie) {
		this.tie = tie;
	}

	/**
	 * @return the defeat
	 */
	public int getDefeat() {
		return defeat;
	}

	/**
	 * @param defeat the defeat to set
	 */
	public void setDefeat(int defeat) {
		this.defeat = defeat;
	}

	/**
	 * @return the players
	 */
	public List<String> getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(List<String> players) {
		this.players = players;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		//파생 속성은 가져오기 전에 계산을 하면 됩니다.
		points = win * 3 + tie * 1;
		return points;
	}

	@Override
	public String toString() {
		return "Team [team_name=" + team_name + ", count=" + count + ", win=" + win + ", tie=" + tie + ", defeat="
				+ defeat + ", points=" + points + ", players=" + players + "]";
	}
	
	
	
}
