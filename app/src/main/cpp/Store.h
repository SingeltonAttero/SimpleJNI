//
// Created by YWeber on 9/19/2019.
//

#ifndef TESTC_STORE_H
#define TESTC_STORE_H

#include <cstdint>

#define STORE_MAX_CAPACITY 16


typedef enum {
} StoreType;
typedef union {
} StoreValue;

typedef struct {
    char *key;
    StoreType type;
    StoreValue value;
} StoreEntry;

typedef struct {
    StoreEntry entry[STORE_MAX_CAPACITY];
    int32_t length;
} Store;

#endif //TESTC_STORE_H
