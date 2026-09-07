(ns kotoba.io-test
  "Tests for kotoba.io"
  (:require [clojure.test :as t]
            [kotoba.io :as io]))

(t/deftest sha256-cid-basic
  (t/is (some? (io/sha256-cid (byte-array 0)))))

(t/deftest sha256-cid-with-data
  (t/is (some? (io/sha256-cid (byte-array [1 2 3 4 5])))))

(t/deftest write-read-roundtrip
  (let [path "/tmp/test-io-file"]
    (t/is (some? (io/write-bytes (byte-array [1 2 3 4 5]) path)))))
