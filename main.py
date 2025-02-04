import time
import matplotlib.pyplot as plt

# Bubble Sort
def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

# Selection Sort
def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        min_idx = i
        for j in range(i+1, n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]

# Quick Sort
def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quick_sort(left) + middle + quick_sort(right)

# Function to measure time complexity
def measure_time(sort_function, arr):
    start_time = time.time()
    sort_function(arr.copy())
    end_time = time.time()
    return end_time - start_time

# Input numbers
numbers = list(map(int, input("Enter numbers separated by spaces: ").split()))

# Measure time for each sorting algorithm
bubble_time = measure_time(bubble_sort, numbers)
selection_time = measure_time(selection_sort, numbers)
quick_time = measure_time(quick_sort, numbers)

# Print the time taken by each algorithm
print(f"Bubble Sort Time: {bubble_time:.6f} seconds")
print(f"Selection Sort Time: {selection_time:.6f} seconds")
print(f"Quick Sort Time: {quick_time:.6f} seconds")

# Plotting the time complexity
algorithms = ['Bubble Sort', 'Selection Sort', 'Quick Sort']
times = [bubble_time, selection_time, quick_time]

plt.bar(algorithms, times, color=['blue', 'green', 'red'])
plt.xlabel('Sorting Algorithm')
plt.ylabel('Time (seconds)')
plt.title('Time Complexity of Sorting Algorithms')
plt.show()
