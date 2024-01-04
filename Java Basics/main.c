#include <stdio.h>

// Function to perform bucket sort
void bucketSort(float arr[], int n) {
    const int numBuckets = 101; // Assuming percentages are between 0 and 100
    int buckets[numBuckets];

    // Initialize the buckets to zero
    for (int i = 0; i < numBuckets; i++) {
        buckets[i] = 0;
    }

    // Put the percentages into the appropriate buckets
    for (int i = 0; i < n; i++) {
        int index = (int)(arr[i] * 100);
        buckets[index]++;
    }

    // Display the top five scores
    printf("Top five scores:\n");
    int count = 0;
    for (int i = numBuckets - 1; i >= 0 && count < 5; i--) {
        while (buckets[i] > 0 && count < 5) {
            float score = (float)i / 100.0;
            printf("%.2f%%\n", score * 100);
            buckets[i]--;
            count++;
        }
    }
}

int main() {
    int n;
    printf("Enter the number of students: ");
    scanf("%d", &n);

    float percentages[n];

    // Input student percentages
    for (int i = 0; i < n; i++) {
        printf("Enter the percentage for student %d: ", i + 1);
        scanf("%f", &percentages[i]);
    }

    // Perform bucket sort
    bucketSort(percentages, n);

    return 0;
}
