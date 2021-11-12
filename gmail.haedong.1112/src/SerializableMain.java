import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class DTO implements Serializable {
	private int num;
	private String name;
	private Date birth;
	private boolean adult;
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birth
	 */
	public Date getBirth() {
		return birth;
	}

	/**
	 * @param birth the birth to set
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	/**
	 * @return the adult
	 */
	public boolean isAdult() {
		return adult;
	}

	/**
	 * @param adult the adult to set
	 */
	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + ", adult=" + adult + "]";
	}

}

public class SerializableMain {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;

		try {
			// 현재 디렉토리에 instance.txt 파일의 경롤르 갖는 인스턴스 생성
			oos = new ObjectOutputStream(new FileOutputStream("../../Desktop/Java/java/IOFIle_ex/instance.txt"));

			List<DTO> list = new ArrayList<>();
			
			Date date = new Date();
			
			DTO dto = new DTO();
			dto.setNum(0);
			dto.setName("marbin");

			dto.setAdult(true);

			list.add(dto);

			dto = new DTO();
			dto.setNum(1);
			dto.setName("herry");
			// dto.setBirth(birth.getFullYear());
			dto.setAdult(true);

			list.add(dto);

			oos.writeObject(list);

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 인스턴스 단위로 읽기
		ObjectInputStream ois = null;
		try {
			// 현재 디렉터리의 instance.txt 파일의 내요을 읽을 수 있는 ObjectInputStream 인스턴스 생성
			ois = new ObjectInputStream(new FileInputStream("../../Desktop/Java/java/IOFIle_ex/instance.txt"));

			Object line = ois.readObject();

			// Object 타입을 리턴받은 경우 수행할 작업?
			// 원래의 자료형으로 되돌리는 일
			List<DTO> list = (List<DTO>) line;

			for (DTO temp : list) {
				System.out.println(temp);
			}

			// System.out.println(line);

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
