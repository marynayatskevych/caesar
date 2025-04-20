# Caesar Cipher


**What was done:**

File encryption and decryption using Caesar Cipher.

Console input support for encryption and decryption.

Output files are generated with correct suffixes [ENCRYPTED] and [DECRYPTED].


**What was not implemented:**

Brute-force decryption mode was not implemented.

Ukrainian alphabet.

Front-end. GUI (Swing, JavaFX) 


**Class descriptions:**

Main — starts the application and calls Runner with command-line arguments.

Runner — determines which command to run based on arguments (ENCRYPT, DECRYPT, ENCRYPT_CONSOLE, DECRYPT_CONSOLE).

Encrypt — reads a text file, encrypts its content using Caesar Cipher, and writes the result.

Decrypt — reads an encrypted file, decrypts it using Caesar Cipher and the key, then saves it.

EncryptConsole — asks the user to enter text and key via console and prints the encrypted result.

DecryptConsole — asks the user to enter encrypted text and key via console and prints the decrypted text.

CaesarCipher — contains the logic for Caesar Cipher encryption.

FileService — reads and writes files, generates output file names with correct suffixes.

ConsoleReader — reads from the console.

**Commands:** 

*java -jar Caesar.jar ENCRYPT /path/to/file.txt 5*

*java -jar Caesar.jar DECRYPT /path/to/file[ENCRYPTED].txt 5*

*java -jar Caesar.jar ENCRYPT_CONSOLE*

*java -jar Caesar.jar DECRYPT_CONSOLE*

