package edu.ntudp.fit.hladchenko;

import java.util.Random;
import java.util.Scanner;

public class MatrixTask {
    private static final int MAX_SIZE = 20;
    private static final int MIN_RANDOM = 1;
    private static final int MAX_RANDOM = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix;

        if (rows <= MAX_SIZE && columns <= MAX_SIZE) {
            System.out.println("Choose the method of matrix creation:");
            System.out.println("1. Manual input");
            System.out.println("2. Random generation");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    matrix = createMatrixManually(rows, columns, scanner);
                    break;
                case 2:
                    matrix = createMatrixRandomly(rows, columns);
                    break;
                default:
                    System.out.println("Invalid choice. Exiting program.");
                    return;
            }

            System.out.println("Matrix:");
            printMatrix(matrix);

            int minElement = findMinElement(matrix);
            int maxElement = findMaxElement(matrix);
            double average = calculateAverage(matrix);
            double geometricMean = calculateGeometricMean(matrix);

            System.out.println("Min element: " + minElement);
            System.out.println("Max element: " + maxElement);
            System.out.println("Average: " + average);
            System.out.println("Geometric Mean: " + geometricMean);
        } else {
            System.out.println("Matrix size exceeds the limit. Exiting program.");
        }
    }

    private static int[][] createMatrixManually(int rows, int columns, Scanner scanner) {
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static int[][] createMatrixRandomly(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM;
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static int findMinElement(int[][] matrix) {
        int minElement = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element < minElement) {
                    minElement = element;
                }
            }
        }

        return minElement;
    }

    private static int findMaxElement(int[][] matrix) {
        int maxElement = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element > maxElement) {
                    maxElement = element;
                }
            }
        }

        return maxElement;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }

        return (double) sum / count;
    }

    private static double calculateGeometricMean(int[][] matrix) {
        int multiplication = 1;
        int count = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                multiplication *= element;
                count++;
            }
        }

        return Math.pow(multiplication, 1.0 / count);
    }
}
