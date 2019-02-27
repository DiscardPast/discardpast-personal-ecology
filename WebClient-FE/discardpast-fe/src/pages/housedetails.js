import styles from './housedetails.css';
import IndexHeader from '@/components/index/IndexHeader';
import React from 'react';
import AddHouseItem from '@/components/house/AddHouseItem';

export default function() {
  return (
    <div className={styles.normal}>
      <AddHouseItem/>
    </div>
  );
}
