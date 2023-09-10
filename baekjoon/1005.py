from sys import stdin
T = int(stdin.readline())
def bridge(A,B):
    s =1
    for x in range(1,B+1):
        s *= A
        s /= x
        A-=1
    return s
    
for _ in range(T):
    N, M = map(int, stdin.readline().split())
    print(int(bridge(M,N)))