#include <stdio.h>

int main(){
    float num1, num2, result;
    int operator;

    printf("------ SIMPLE CALCULATOR ------\n\n");

    printf("Enter first number: ");
    scanf("%f", &num1);

    printf("\nChoose an operation:\n");
    printf("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
    scanf("%d", &operator);  
    
    printf("\nEnter second number: ");
    scanf("%f", &num2);

    switch(operator){

        case 1:
            result = num1 + num2;
            printf("\nResult: %.2f\n", result);
            break;

        case 2:
            result = num1 - num2;
            printf("\nResult: %.2f\n", result);
            break;

        case 3:
            result = num1 * num2;
            printf("\nResult: %.2f\n", result);
            break;

        case 4:
            if(num2 != 0){
                result = num1 / num2;
                printf("\nResult: %.2f\n", result);
            } 
            else{
                printf("\nError! Division by zero is not possible.\n");
            }
            break;

        default:
            printf("\nInvalid operation! Please enter between 1-4\n");
    }

    return 0;
}