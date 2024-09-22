#include <iostream>
#include <cmath>
#include <limits>
using namespace std;

// Function prototypes
double squareRoot(double x);
unsigned long long factorial(int x);
double naturalLog(double x);
double power(double x, double b);
double add(double x, double y);
double multiply(double x, double y);
double divide(double x, double y);

// Helper function to handle invalid input
void clearInput()
{
    cin.clear();
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
}

void menu()
{
    int choice;
    do
    {
        cout << "\nScientific Calculator Menu:\n";
        cout << "1. Square Root\n2. Factorial\n3. Natural Logarithm\n4. Power Function\n";
        cout << "5. Addition\n6. Multiplication\n7. Division\n";
        cout << "Enter your choice (1-7, 0 to exit): ";
        cin >> choice;

        if (cin.fail())
        {
            clearInput();
            cout << "Invalid input, please enter a valid choice.\n";
            continue;
        }

        double x, b;
        switch (choice)
        {
        case 1:
            cout << "Enter number for square root: ";
            cin >> x;
            if (x < 0)
            {
                cout << "Error: Cannot compute square root of negative number.\n";
            }
            else
            {
                cout << "Result: " << squareRoot(x) << endl;
            }
            break;
        case 2:
            cout << "Enter number for factorial: ";
            cin >> x;
            if (x < 0 || floor(x) != x)
            {
                cout << "Error: Factorial is defined for non-negative integers only.\n";
            }
            else
            {
                cout << "Result: " << factorial(static_cast<int>(x)) << endl;
            }
            break;
        case 3:
            cout << "Enter number for natural logarithm: ";
            cin >> x;
            if (x <= 0)
            {
                cout << "Error: Logarithm is defined for positive numbers only.\n";
            }
            else
            {
                cout << "Result: " << naturalLog(x) << endl;
            }
            break;
        case 4:
            cout << "Enter base: ";
            cin >> x;
            cout << "Enter exponent: ";
            cin >> b;
            cout << "Result: " << power(x, b) << endl;
            break;
        case 5:
            cout << "Enter two numbers for addition: ";
            cin >> x >> b;
            cout << "Result: " << add(x, b) << endl;
            break;
        case 6:
            cout << "Enter two numbers for multiplication: ";
            cin >> x >> b;
            cout << "Result: " << multiply(x, b) << endl;
            break;
        case 7:
            cout << "Enter dividend and divisor for division: ";
            cin >> x >> b;
            if (b == 0)
            {
                cout << "Error: Division by zero is undefined.\n";
            }
            else
            {
                cout << "Result: " << divide(x, b) << endl;
            }
            break;
        case 0:
            cout << "Exiting calculator. Goodbye!\n";
            break;
        default:
            cout << "Invalid choice. Please try again.\n";
        }
    } while (choice != 0);
}

// Function implementations
double squareRoot(double x)
{
    return sqrt(x);
}

unsigned long long factorial(int x)
{
    unsigned long long result = 1;
    for (int i = 1; i <= x; ++i)
    {
        result *= i;
    }
    return result;
}

double naturalLog(double x)
{
    return log(x);
}

double power(double x, double b)
{
    return pow(x, b);
}

double add(double x, double y)
{
    return x + y;
}

double multiply(double x, double y)
{
    return x * y;
}

double divide(double x, double y)
{
    return x / y;
}

int main()
{
    menu();
    return 0;
}
