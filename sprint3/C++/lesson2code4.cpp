#include <string>

std::string as_binary_string(int n) {
    if (n < 0) {
        return "-" + as_binary_string(-n);
    }
    if (n == 0 || n == 1) {
        return std::to_string(n);
    }
    int last_digit = n % 2;
    return as_binary_string(n / 2) + std::to_string(last_digit);
}
