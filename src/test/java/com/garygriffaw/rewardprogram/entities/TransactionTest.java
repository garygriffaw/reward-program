package com.garygriffaw.rewardprogram.entities;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TransactionTest {

    @Test
    void calculateRewardPoints0Amount() {
        //given
        Transaction transaction = new Transaction();
        transaction.setAmount(0);

        //then
        assertThat(transaction.calculateRewardPoints()).isEqualTo(0);
    }

    @Test
    void calculateRewardPoints50_99Amount() {
        //given
        Transaction transaction = new Transaction();
        transaction.setAmount(50.99);

        //then
        assertThat(transaction.calculateRewardPoints()).isEqualTo(0);
    }

    @Test
    void calculateRewardPoints51Amount() {
        //given
        Transaction transaction = new Transaction();
        transaction.setAmount(51);

        //then
        assertThat(transaction.calculateRewardPoints()).isEqualTo(1);
    }

    @Test
    void calculateRewardPoints100_99Amount() {
        //given
        Transaction transaction = new Transaction();
        transaction.setAmount(100.99);

        //then
        assertThat(transaction.calculateRewardPoints()).isEqualTo(50);
    }

    @Test
    void calculateRewardPoints101Amount() {
        //given
        Transaction transaction = new Transaction();
        transaction.setAmount(101);

        //then
        assertThat(transaction.calculateRewardPoints()).isEqualTo(52);
    }

    @Test
    void calculateRewardPoints1000Amount() {
        //given
        Transaction transaction = new Transaction();
        transaction.setAmount(1000);

        //then
        assertThat(transaction.calculateRewardPoints()).isEqualTo(1850);
    }
}