/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
@FunctionalInterface
public interface Operation<T>{
    T operate(T val1, T val2);
}
