#include <chrono>
#include <iostream>

int main() {
	using namespace std::chrono;
	auto time_start = high_resolution_clock::now();
	int i = 0;
	while (i < 1000000000) {
		// Do nothing
		++i;
	}
	auto time_finish = high_resolution_clock::now();
	auto time_span = duration_cast<duration<double>>(time_finish - time_start);

	std::cout << time_span.count() << " seconds\n";
  return 0;
}
