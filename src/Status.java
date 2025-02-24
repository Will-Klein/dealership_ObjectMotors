public enum Status {
    SALE,               //for sale
    SOLD,               //sold
    MAINTENENCE,        //under maintenance
    FINISHED;           //vehicle out of maintenance

    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
