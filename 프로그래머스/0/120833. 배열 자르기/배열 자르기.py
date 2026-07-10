def solution(numbers, num1, num2):
    answer = []
    for i in range(num2-num1+1) :
        answer.append(numbers[num1+i]);
    return answer