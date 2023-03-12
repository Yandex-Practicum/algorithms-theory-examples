def stairs_builder(n):
    # build 1 step
    print("Осталось построить {} ступеней.".format(n))
    stairs_builder(n - 1)
