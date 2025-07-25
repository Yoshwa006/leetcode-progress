// Last updated: 7/25/2025, 8:49:14 AM
/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    let value;
    await promise1.then((response)=>{
        value = response;
    })

    await promise2.then((response)=>{
        value = value + response;
    })

    return value
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */