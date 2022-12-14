# Flyweight Pattern

### π Caching μΌλ‘ λ©λͺ¨λ¦¬ μ¬μ©μ μ€μ¬λ³΄μ!

* μμ£Ό λ³νλ μμ±(extrinsic)κ³Ό λ³νμ§ μλ μμ±(intrinsic)μ λΆλ¦¬νκ³  μ¬μ¬μ©νμ¬ λ©λͺ¨λ¦¬ μ¬μ©μ μ€μΌ μ μλ€.
* μ΄ ν¨ν΄μ μ μ©νκΈ° μ  μ μ©λμμ΄ λλ λ°μ΄ν°κ° extrinsic νμ§ intrinsic νμ§ μκ°ν΄μΌνλ€.

![](images/flyweightClassDiagram.png)
## 1. Implementation
* λ³νμ§ μλ λμΌν μ λ³΄λ₯Ό μ¬λ¬ κ³³μμ μ¬μ©λ κ²½μ° 
* => μ¬λ¬κ³³μμ μ¬μ©νκΈ° λλ¬Έμ μ μ€ν μ ν

![](images/fontFactory.png)
## 2. Pros and cons
* μ₯μ :
    * μ νλ¦¬μΌμ΄μμμ μ¬μ©νλ λ©λͺ¨λ¦¬λ₯Ό μ€μΌ μ μλ€.
* λ¨μ 
    * μ½λμ λ³΅μ‘λκ° μ¦κ°νλ€.
* λ¬Έμ 
    * μμ μμ μμ±λ Font λ€μ λ©λͺ¨λ¦¬μ μ΄λ μμ­μ μμ±λλ©° μΈμ  μλ©Έ λ κΉμ?

## 3. Example
* Java
    * Integer.valueOf(int)
    * μΊμλ₯Ό μ κ³΅νλ€.
  > valueOf method in Integer class ([Java Doc](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#valueOf-int-))
    ```
     /**
     * Returns an {@code Integer} instance representing the specified
     * {@code int} value.  If a new {@code Integer} instance is not
     * required, this method should generally be used in preference to
     * the constructor {@link #Integer(int)}, as this method is likely
     * to yield significantly better space and time performance by
     * caching frequently requested values.
     *
     * This method will always cache values in the range -128 to 127,
     * inclusive, and may cache other values outside of this range.
     *
     * @param  i an {@code int} value.
     * @return an {@code Integer} instance representing {@code i}.
     * @since  1.5
     */
    
    static final Integer[] cache;
    
    @IntrinsicCandidate
    public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
  ```