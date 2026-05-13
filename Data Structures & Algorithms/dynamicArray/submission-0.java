class DynamicArray {
    private Integer[] dynamicArray;
    public DynamicArray(int capacity) {
        dynamicArray = new Integer[capacity];
    }

    public int get(int i) {
        return dynamicArray[i];
    }

    public void set(int i, int n) {
        dynamicArray[i] = n;
    }

    public void pushback(int n) {
        boolean hasSpace = false;
        int arraySize = dynamicArray.length;
        for(int i = 0; i < arraySize; i++){
            if(dynamicArray[i] == null){
                hasSpace = true;
                dynamicArray[i] = n;
                break;
            }
        }
        if(hasSpace) return;
        resize();
        dynamicArray[arraySize] = n;
    }

    public int popback() {
        int num = dynamicArray[(this.getSize() - 1)];
        dynamicArray[(this.getSize() - 1)] = null;
        return num;
    }

    private void resize() {
        int arraySize = dynamicArray.length;
        Integer[] newArray = new Integer[arraySize * 2];
        System.arraycopy(dynamicArray, 0, newArray, 0, arraySize);
        dynamicArray = newArray;
    }

    public int getSize() {
        int size = 0;
        for(Integer num : dynamicArray){
            if(num == null) break;
            size++;
        }
        return size;
    }

    public int getCapacity() {
        return dynamicArray.length;
    }
}
