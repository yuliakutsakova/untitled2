import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int[][] array = new int[1][100];
int count = 1;
for(int i = 0; i < array.length; i++){
    for(int j=0; j < array[i].length; j++){
      array[i][j]=count++;


}
    }
    System.out.println(Arrays.deepToString(array));
}
    }