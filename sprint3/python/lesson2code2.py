def stairs_builder(n):
    if n == 0:
        return
    # build 1 step
    print("Осталось построить {} ступеней.".format(n))
    stairs_builder(n - 1)    
