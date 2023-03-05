import time

time_start = time.time()
i = 0
while i < 1000000000:
    # Do nothing
    i += 1

time_finish = time.time()
time_span = time_finish - time_start
print(time_span, 'seconds')