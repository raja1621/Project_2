package app.AdventCode.Day7;

public class WeightedEdge {
    String src;
    String des;

    WeightedEdge(String src, String des) {
        this.src = src;
        this.des = des;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
