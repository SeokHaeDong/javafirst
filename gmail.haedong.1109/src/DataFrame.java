public class DataFrame {

	public static void main(String[] args) {
		java.util.List<Team> list = new java.util.ArrayList<>();

		Team team = new Team();
		team.setTeam_name("토트넘");
		team.setCount(11);
		team.setWin(5);
		team.setTie(1);
		team.setDefeat(5);
		team.getPlayers().add("손흥민");
		team.getPlayers().add("케인");

		list.add(team);

		team = new Team();
		team.setTeam_name("첼시");
		team.setCount(11);
		team.setWin(8);
		team.setTie(2);
		team.setDefeat(1);
		team.getPlayers().add("루카쿠");
		team.getPlayers().add("하베르츠");

		list.add(team);

		team = new Team();
		team.setTeam_name("맨시티");
		team.setCount(11);
		team.setWin(7);
		team.setTie(2);
		team.setDefeat(2);
		team.getPlayers().add("페르난지뉴");
		team.getPlayers().add("권도안");

		list.add(team);

		team = new Team();
		team.setTeam_name("맨유");
		team.setCount(11);
		team.setWin(5);
		team.setTie(2);
		team.setDefeat(4);
		team.getPlayers().add("호날두");
		team.getPlayers().add("포그바");

		list.add(team);

		// 데이터 전체 읽어오기
		// 빠른 열거 사용 
		for (Team t : list) {
			System.out.print(t.getTeam_name() + " ");
			System.out.print(t.getPoints() + " ");
			for (String player : t.getPlayers()) {
				System.out.print(player + " ");
			}
			System.out.println();
		}

		System.out.println("==========================");
		// list.get(0);
		// 데이터 1개 가져오기
		System.out.println(list.get(0));
		
		System.out.println("==========================");
		// 데이터 일부분 출력하기
		int i = 0;
		for (i = 0; i < 2; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==========================");

		java.util.Scanner sc = new java.util.Scanner(System.in);

		while (true) {
			System.out.println("1.이름 오름차순 2. 승점 내림차순 3. 종료");
			String menu = sc.nextLine();
			if (menu.equals("1")) {
				list.sort(new java.util.Comparator<Team>() {

					@Override
					public int compare(Team o1, Team o2) {
						// TODO Auto-generated method stub
						return o1.getTeam_name().compareTo(o2.getTeam_name());
					}

				});
			} else if (menu.equals("2")) {
				list.sort(new java.util.Comparator<Team>() {

					@Override
					public int compare(Team o1, Team o2) {
						// TODO Auto-generated method stub
						return o2.getPoints() - o1.getPoints();
					}

				});
			} else if (menu.equals("3")) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못된 메뉴 선언");
			}

			for (Team t : list) {
				System.out.println(t.getTeam_name());
			}

		}

	}

}
