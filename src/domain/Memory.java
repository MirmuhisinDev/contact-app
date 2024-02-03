package domain;

public class Memory {
    private Long id;
    private int hardDisk;
    private int ram;

    public Memory(Long id, int hardDisk, int ram) {
        this.id = id;
        this.hardDisk = hardDisk;
        this.ram = ram;
    }
    public Memory(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "id=" + id +
                ", hardDisk=" + hardDisk +
                ", ram=" + ram +'}';
    }
}
