package BAB6;
public class MainGaji {
    public static void main(String[] args) {
        Software_Engineer se = new Software_Engineer(4);
        Project_manager pm = new Project_manager(10);
        System.out.println("Software Engineer");
        System.out.println("Gaji perbulan masa kerja 4 tahun  : " + se.getTotal());
        System.out.println("Project Manager");
        System.out.println("Gaji perbulan masa kerja 10 tahun : "+ pm.getTotal());
    }
    
}
