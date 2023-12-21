public class Fighter {
    private boolean vulnerable = false;

    public String toString() {
        return "Fighter is a " +  getClass().getName();
    }
    public boolean isVulnerable(){
        return vulnerable;
    }

}
