def solution(my_string, queries):
    answer = ''
    # [[2, 3], [0, 7], [5, 9], [6, 10]]
    for i in queries :
        q = i
        start = q[0]
        end = q[1]
        
        answer = my_string[:start]
        answer += my_string[start:end+1][::-1]
        answer += my_string[end+1:]
        my_string = answer;
    return answer