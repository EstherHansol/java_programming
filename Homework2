public class Student {       // 학생 한명 한명의 정보를 담는 학생클래스 ( 생성되면 학생1명(객체)의 정보가된다 )

    private String name;
    private int phone;
    private int studentNum;
    private String major;

    public Student(String name, int phone, int studentNum, String major) {
        // 생성자! 매개변수로 이름,전화번호,학번,전공 정보 받아와 초기화하고 독립된 객체(학생 한 명의 정보) 생성.
        this.name = name;
        this.phone = phone;
        this.studentNum = studentNum;
        this.major = major;
    }

    public void updateInfo(int i, String info) {    // 객체 정보 수정하는메소드 ( 즉 해당 객체 데이터 수정할때 )
        // TODO Auto-generated method stub
        switch (i) {
            case 1:		// 이름 수정 ( 매개변수 i=1 )
                setName(info);
                break;

            case 2:		// 전화번호 수정
                setPhone(Integer.parseInt(info));   // 정수변환 (문자열로 받아왓으니까 )
                break;

            case 3:		// 학번 수정
                setStudentNum(Integer.parseInt(info));
                break;

            case 4:		// 전공 수정
                setMajor(info);
                break;

        }
    }

    public String getName() {         //pirvate 한 인스턴스 변수들에게 접근하기 위한 getter setter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void Phone(int phone) {
        this.phone = phone;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
