package com.oakinvest.b2g.service;

import com.oakinvest.b2g.dto.bitcoin.core.BitcoinCoreBlockData;

import java.util.Optional;

/**
 * Bitcoin data service.
 *
 * Created by straumat on 11/06/17.
 */
public interface BitcoinDataService {

    /**
     * Return getblockcount.
     *
     * @return the number of blocks in the block chain.
     */
    Optional<Integer> getBlockCount();

    /**
     * Get block data from buffer.
     *
     * @param blockHeight block height
     * @return block data
     */
    Optional<BitcoinCoreBlockData> getBlockData(int blockHeight);

    /**
     * Load block and transactions of a block in the buffer.
     *
     * @param blockHeight block height
     */
    void addBlockInBuffer(int blockHeight);

}
