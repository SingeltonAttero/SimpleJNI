//
// Created by YWeber on 9/19/2019.
//

#ifndef TESTC_STORE_H
#define TESTC_STORE_H

#include <cstdint>


#define STORE_MAX_CAPACITY 16


typedef enum {
    StoreTypeText
} StoreType;
typedef union {
    char *text;
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

bool isEntryValid(JNIEnv *env, StoreEntry *entry, StoreType *type);

StoreEntry *allocateEntry(JNIEnv *env, Store *store, jstring key);

StoreEntry *findEntry(JNIEnv *env, Store *store, jstring key);

void releaseEntryValue(JNIEnv env, StoreEntry entry);

#endif //TESTC_STORE_H
