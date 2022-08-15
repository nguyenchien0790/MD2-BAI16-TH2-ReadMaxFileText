import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }

        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWirteFile readAndWirteFile = new ReadAndWirteFile();
        String PATH_NUMBER = "D:\\IdeaProjects\\MD2_B16_TH2_Read_n_Write\\src\\numbers.txt";
        String PATH_RESULT = "D:\\IdeaProjects\\MD2_B16_TH2_Read_n_Write\\src\\result.txt";
        List<Integer> nnumbers = readAndWirteFile.readFile(PATH_NUMBER);
        int maxvalue = findMax(nnumbers);
        readAndWirteFile.writeFile(PATH_RESULT, maxvalue);
    }
}
