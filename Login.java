
package model;

public class Login {
    private String tk;
    private String mk;

    public Login() {
    }

    public Login(String tk, String mk) {
        this.tk = tk;
        this.mk = mk;
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    @Override
    public String toString() {
        return "loign{" + "tk=" + tk + ", mk=" + mk + '}';
    }
    
}
