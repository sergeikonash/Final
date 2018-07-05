public class ChristmasTreeToy implements Comparable {
    String color;
    int size;

    ChristmasTreeToy(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChristmasTreeToy)) return false;

        ChristmasTreeToy that = (ChristmasTreeToy) o;

        if (size != that.size) return false;
        return color != null ? color.equals(that.color) : that.color == null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChristmasTreeToy{");
        sb.append("color='").append(color).append('\'');
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(Object o) {
        return ((ChristmasTreeToy)o).size - this.size;
    }
}
